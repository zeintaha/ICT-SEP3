namespace DNPExercises10DataAccess.Data.Entities
{
    public class OrderItem
    {
        public int Id { get; set; }
        public Cat cat { get; set; }
        public int quantity { get; set; }
        public Order order { get; set; }

    }
}