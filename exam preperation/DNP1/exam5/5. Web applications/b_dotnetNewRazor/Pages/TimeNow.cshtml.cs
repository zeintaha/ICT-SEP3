using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace dotnetNewRazor.Pages
{
    public class TimeNowModel : PageModel
    {

        public void OnGet()
        {
            ViewData["MyNumber"] = 42;
            ViewData["MyString"] = "this string coming from viewData";
            ViewData["MyObject"] = new Book
            {
                Title = "Sum Of All Fears",
                Author = "Tom Clancy",
                Price = 5.99m
            };
        }
    }
}