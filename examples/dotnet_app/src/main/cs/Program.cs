using System;
using Newtonsoft.Json;

namespace MyDotNetApp
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello from .NET with Gradle!");
            
            var person = new Person { Name = "John Doe", Age = 30 };
            string json = JsonConvert.SerializeObject(person);
            Console.WriteLine($"Serialized object: {json}");
        }
    }

    public class Person
    {
        public string Name { get; set; }
        public int Age { get; set; }
    }
}