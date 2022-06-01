# Втора лабораториска вежба по Софтверско инженерство

## Никола Настев, 195081

## Control Flow Graph

![graf](https://user-images.githubusercontent.com/68243750/171494071-bb885b0c-c8e5-4f66-b21c-edcb7bdb0d5e.png)


## Цикломатска комплексност

Цикломатската комплекстност на овој код е 9, ја добив со формулата C = P + 1, каде што C e вредноста за Цикломатската комплетност, а P е бројот на предикатни јазли.
Предикатните јазли во овој CFG се јазлите {1, 345, 8.2, 9, 11, 12, 15, 17}. Имаме P = 8, така што C = 8 + 1.

# Every statement

IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
assertTrue(ex.getMessage().contains("List length should be greater than 0"));

ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#", "0")));

assertTrue(ex.getMessage().contains("List length should be a perfect square"));

List<String> initial = List.of("0", "#", "0", "#", "0", "#", "0", "#", "0");
  
List<String> expected = List.of("2", "#", "2", "#", "4", "#", "2", "#", "2");
assertEquals(SILab2.function(initial), expected);

Со овој тест, имаме every statement покривање на тестови. Со двата assertThrows проверуваме дали програмата иде по патеките 1,2,22, т.е. 1,3,4,5,6,22.
Со inputot за матрицата, т.е. initial, се поминуваат сите останати statements во програмата барем еднаш.
  
# Every branch
  
IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
assertTrue(ex.getMessage().contains("List length should be greater than 0"));

ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#", "0")));
  
assertTrue(ex.getMessage().contains("List length should be a perfect square"));

List<String> initial = List.of("0", "#", "0", "#", "#", "0", "#", "#", "0", "#", "0", "#", "0", "0", "0", "#");
  
List<String> expected = List.of("2", "#", "3", "#", "#", "4", "#", "#", "2", "#", "3", "#", "0", "1", "1", "#");
assertEquals(SILab2.function(initial), expected);
  
Исто како предходниот тест, мора да имаме assertThrows, за да ги изминеме гранките со exception. Матрицата мора да се прошири во 4x4 за да добиеме изминување на сите гранки барем по еднаш. Со матрицата 3x3, ги поминуваме сите гранки освен 11-15, која што никогаш не ја опфаќаме, т.е. поминуваме. Со проширената матрица, се опфаќа и тој случај, конкретно членот со индекс 13, и од левата и од десната страна нема бомба. Со тоа осигуруваме дека барем еднаш ќе се изврши гранката 11-15.
  
И во двата теста, ги reverse-engineernav матриците за да ги задоволам условите на тестот.
