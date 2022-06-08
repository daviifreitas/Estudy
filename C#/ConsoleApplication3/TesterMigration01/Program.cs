using TesterMigration01;

class Program
{
    public static void Main(string[] args)
    {
        using (var db = new Model.BlogContext())
        {
            db.Blogs.Add(new Blog { Name = "Another Blog " });
            db.SaveChanges();

            foreach (var blog in db.Blogs)
            {
                Console.WriteLine(blog.Name);
            }
        }

        Console.WriteLine("Press any key for continue .....");
        Console.ReadKey();
    }
}