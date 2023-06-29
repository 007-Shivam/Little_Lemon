package com.example.littlelemon.data

import com.example.littlelemon.R

data class Dish (
    val name: String,
    val price: String,
    val description: String,
    val image: Int,
)

val dishes = listOf<Dish>(
    Dish("Paneer 65", "Rs. 150",  "Paneer 65 is a popular restaurant style appetizer or starter perfect for parties and get together", R.drawable.paneer65,),
    Dish("Tandoori Chicken", "Rs. 300",  "Tandoori chicken is a South Asian dish of chicken marinated in yogurt and spices and roasted in a tandoor.", R.drawable.tandoori,),
    Dish("Butter Chicken", "Rs. 250",  "Butter chicken is an Indian dish made from chicken with a spiced tomato and butter sauce.", R.drawable.butter_chicken,),
    Dish("Choola Bhatura", "Rs. 150",  "Chole bhature is a combination of chana masala and bhatura/puri.", R.drawable.choola_bhatura,),
    Dish("Paav Bhaji", "Rs. 100",  "Pav bhaji is a street food dish from India consisting of a thick vegetable curry served with a soft bread roll.", R.drawable.palak_paneer,),
    Dish("Paalak Paneer", "Rs. 150",  "Palak paneer is a creamy Indian dish made with spinach and cottage cheese.", R.drawable.pav_bhaaji,),
    Dish("Gulab Jamun", "Rs. 200",  "Gulab jamun is a sweet confectionery or dessert, originating in the Indian subcontinent.", R.drawable.gulab_jamun,),
    Dish("Jalebi", "Rs. 150",  "Jalebi is a popular sweet snack in south and west Asia, Africa, and Mauritius.", R.drawable.jalebi,),
)

val st = listOf<Dish>(
    Dish("Paneer 65", "Rs. 150",  "Paneer 65 is a popular restaurant style appetizer or starter perfect for parties and get together", R.drawable.paneer65,),
    Dish("Tandoori Chicken", "Rs. 300",  "Tandoori chicken is a South Asian dish of chicken marinated in yogurt and spices and roasted in a tandoor.", R.drawable.tandoori,),
)

val mn = listOf<Dish>(
    Dish("Butter Chicken", "Rs. 250",  "Butter chicken is an Indian dish made from chicken with a spiced tomato and butter sauce.", R.drawable.butter_chicken,),
    Dish("Choola Bhatura", "Rs. 150",  "Chole bhature is a combination of chana masala and bhatura/puri.", R.drawable.choola_bhatura,),
    Dish("Paav Bhaaji", "Rs. 100",  "Pav bhaji is a street food dish from India consisting of a thick vegetable curry served with a soft bread roll.", R.drawable.palak_paneer,),
    Dish("Paalak Paneer", "Rs. 150",  "Palak paneer is a creamy Indian dish made with spinach and cottage cheese.", R.drawable.pav_bhaaji,),
)

val ds = listOf<Dish>(
    Dish("Gulab Jamun", "Rs. 200",  "Gulab jamun is a sweet confectionery or dessert, originating in the Indian subcontinent.", R.drawable.gulab_jamun,),
    Dish("Jalebi", "Rs. 150",  "Jalebi is a popular sweet snack in south and west Asia, Africa, and Mauritius.", R.drawable.jalebi,),
)