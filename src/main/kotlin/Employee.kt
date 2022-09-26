import java.text.DecimalFormat

class Employee(var name: String,
               var position: PositionTitle,
               var salary: Boolean,
               var payRate: Double,
               var shift: Int
               ) {
    var total = 0.0

    init {

    }

    fun calculate(hoursIn: Double) {
        var overtime = 0.0
        var hours = hoursIn
        total = 0.0

        if (!salary && (hoursIn > 40)) {
            overtime = hoursIn - 40
            hours = 40.0
            total += overtime * 1.5 * payRate
        }

        if(shift == 3)
            total += 1.1 * payRate * hours
        else if(shift == 2)
            total += 1.05 * payRate * hours
    }

    fun display() {
        var display = ""
        display += name
        display += " earned "

        val twoDigits = DecimalFormat("$#,###.00")
        display += twoDigits.format(total)

        display += " this week"
        println(display)
    }
}