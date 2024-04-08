using Microsoft.AspNetCore.Http.HttpResults;
using Microsoft.AspNetCore.Mvc;
using OrderService.Model;
using OrderService.Services;

namespace   OrderService.Controllers
{
    [ApiController]
    [Route("api/v1/[controller]")]
    public class OrderController : ControllerBase
    {
        private readonly OrdersService _orderService;

        public OrderController(OrdersService orderService)
        {
            _orderService = orderService;
        }

        [HttpPost]
        public IActionResult PlaceOrder(Order order)
        {
            return Created();
        }
    }
}