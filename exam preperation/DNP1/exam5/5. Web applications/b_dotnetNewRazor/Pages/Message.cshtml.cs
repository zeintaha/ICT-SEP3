using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace dotnetNewRazor.Pages
{
    public class MessageModel : PageModel
    {
        public string _message { get; set; }
        public void OnGet()
        {
           _message = "Message from model";
        }

        public string arrgMethod(String str)
        {
            return "model says: "+ str;
        }
    }
}