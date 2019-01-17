using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ExploreHorsens.Models;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;


namespace ExploreHorsens
{
    public class Startup
    {
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;
        }

        public IConfiguration Configuration { get; }
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddMvc().SetCompatibilityVersion(CompatibilityVersion.Version_2_1);

            services.AddDbContext<BlogDataContext>(options =>
            options.UseSqlServer(Configuration["ConnectionStrings:DefaultConnection"]));

        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {

            var configuration = new ConfigurationBuilder()
                                    .AddEnvironmentVariables()
                                    
                                    .Build();

            if (configuration.GetValue<bool>("EnableDeveloperExceptions"))
            {
                app.UseDeveloperExceptionPage();
            }

            app.Use(async (context, next) =>
            {
                if (context.Request.Path.Value.Contains("invalid"))
                    throw new Exception("ERROR!");

                await next();
            });

            app.UseMvc(routes =>
            {
                routes.MapRoute("Default",
                    "{controller=Default}/{action=Index}/{id?}"
                );
            });
        }
    }
}
