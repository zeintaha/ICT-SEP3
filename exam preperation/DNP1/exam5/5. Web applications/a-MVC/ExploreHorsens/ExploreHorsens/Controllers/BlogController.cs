using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ExploreHorsens.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace ExploreHorsens.Controllers
{

    public class BlogController : Controller
    {
        private readonly BlogDataContext _db;

        public BlogController(BlogDataContext db)
        {
            _db = db;
        }

        public IActionResult Index()
        {
            var posts = _db.Posts.ToArray();

            return View(posts);
        }

        [HttpGet, Route("blog/create")]
        public IActionResult Create()
        {
            return View();
        }

        
        [HttpPost, Route("blog/create")]
        public IActionResult Create(Post post)
        {
            if (!ModelState.IsValid)
                return View();

            post.Author = User.Identity.Name;
            post.Posted = DateTime.Now;

            _db.Posts.Add(post);
            _db.SaveChanges();

            return View();
        }
    }
}