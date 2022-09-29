fun main() {
    var emp1 = Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1);
    var emp2 = Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2);
    var emp3 = Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3);

    emp1.display();
    emp1.calculate(45.0);
    emp2.display();
    emp2.calculate(50.0);
    emp3.display();
    emp3.calculate(35.0);

}

fun goDirection(dir: Compass): String{
    when (dir){
        Compass.NORTH -> return "North"
        Compass.SOUTH -> return "South"
        Compass.EAST -> return "East"
        Compass.WEST -> return "West"
        else -> return "Go Nowhere"
    }
}