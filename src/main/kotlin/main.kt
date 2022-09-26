fun main() {
    var emp1 = Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1);
    var emp2 = Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2);
    var emp3 = Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3);

    emp1.calculate(45.0);
    emp1.display();

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