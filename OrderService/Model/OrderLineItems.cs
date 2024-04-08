namespace OrderService.Model
{
    public class OrderLineItems{
        public long Id { get; set; }
        public string OrderNumber { get; set; }

        public decimal Price { get; set; }

        public int Quantity { get; set; }
    }
}