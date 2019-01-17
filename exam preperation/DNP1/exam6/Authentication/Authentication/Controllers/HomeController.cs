using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Authentication.Models;
using System.Security.Claims;
using Microsoft.AspNetCore.Authentication;
using Microsoft.AspNetCore.Authentication.Cookies;
using Microsoft.AspNetCore.Authorization;

namespace Authentication.Controllers
{
    public class HomeController : Controller
    {
        [HttpPost]
        public async Task<IActionResult> login(string name)
        {
            if (string.IsNullOrEmpty(name))
            {
                return RedirectToAction(nameof(Index));
            }
            var identity = new ClaimsIdentity(new[]
            {
                
                new Claim(ClaimTypes.Name,name),
                new Claim(ClaimTypes.Role,"admin"),},
            CookieAuthenticationDefaults.AuthenticationScheme);
            var principle = new ClaimsPrincipal(identity);
            await HttpContext.SignInAsync(
                CookieAuthenticationDefaults.AuthenticationScheme, principle);
            return RedirectToAction(nameof(Index));
        }
        [Authorize(Policy = "MustBeAdmin")]
        public IActionResult Manage() => View();

        public async Task<IActionResult> logout()
        {
            await HttpContext.SignOutAsync(
                CookieAuthenticationDefaults.AuthenticationScheme);
            return RedirectToAction(nameof(Index));
        }
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult About()
        {
            ViewData["Message"] = "Your application description page.";

            return View();
        }

        public IActionResult Contact()
        {
            ViewData["Message"] = "Your contact page.";

            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
