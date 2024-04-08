using Microsoft.EntityFrameworkCore;
using OrderService.Model;

namespace OrderService.Data
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) : base(options)
        {

        }

        public DbSet<Order> Orders { get; set;}
        public DbSet<OrderLineItems> OrderLineItems { get; set;}
        
    }
}