Каждый раз при новом заказе палочек, проверьте условие:

```java
// Получаем тип дерева заказа
String woodType = order.getWand().getWoodType();
// Смотрим, сколько материала осталось в магазине
Integer woodTypeCnt = woodTypeCount[woodType];
// Проверяем, хватает ли материала
if(woodTypeCnt == null || woodTypeCnt < order.getQuantity()){
    throw new NotEnoughWoodException(woodType);
}
```

Также, напишите такую же проверку для материала сердца палочки.
