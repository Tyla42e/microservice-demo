using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace   OrderService.Model
{
    public class Order {
        
        [Key]
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public long Id { get; set; }
        [Required]
        public string OrderNumber { get; set; }

        public ICollection<OrderLineItems> OrderLineItems { get; set; } = new List<OrderLineItems>();

    }
}