using System;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp7
{
    class Program
    {
        static void Main(string[] args)
        {
            string post = PostData().GetAwaiter().GetResult();
            Console.WriteLine(post);

            string getall = GetData().GetAwaiter().GetResult();
            Console.WriteLine(getall);

            string getbyid = GetData(1).GetAwaiter().GetResult();
            Console.WriteLine(getbyid);

            string delete = deleteData(1).GetAwaiter().GetResult();
            Console.WriteLine(getbyid);




            Console.ReadLine();
        }
        static async Task<string> GetData()
        {
            HttpClient client = new HttpClient();
            var str = await client.GetStringAsync("https://localhost:44363/api/cats");
            return str;
        }

        static async Task<string> GetData(int id)
        {
            HttpClient client = new HttpClient();
            var str1= "https://localhost:44363/api/cats/" + id;
            var str = await client.GetStringAsync(str1);
            return str;
        }

        static async Task<string> deleteData(int id)
        {
            HttpClient client = new HttpClient();
            var str1 = "https://localhost:44363/api/cats/" + id;
            var str = await client.DeleteAsync(str1);
            return null;
        }


        static async Task<string> PostData()
        {
            var client = new HttpClient();
            StringContent httpContent = new StringContent(
                "{ 'Name':'Katty', 'Color':'green', 'FavoriteDish':'Tea', 'Birthdate':'18 / 5 / 2017', 'Price':'73'}", Encoding.UTF8, "application/json"
                );
            HttpResponseMessage response = await client.PostAsync("https://localhost:44363/api/cats", httpContent);
            return response.ToString();
        }
    }
}
