using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DNPExercises10DataAccess.Data.Entities
{
    public class Cat
    {
        public int Id { get; set; }

        [Required]
        [StringLength(maximumLength:20,MinimumLength =2)]
        public string Name { get; set; }

        [RegularExpression(@"^[a-zA-Z]+$")]
        public string Color { get; set; }

        [Required]
        [Range(0, 100)]
        [DataType(DataType.Currency)]
        public decimal Price { get; set; }

        public string Birthdate { get; set; }
        public string FavoriteDish { get; set; }

    }
}
