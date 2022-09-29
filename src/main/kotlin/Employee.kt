import java.text.DecimalFormat

class Employee(var name: String,
               var position: PositionTitle,
               var salary: Boolean,
               var payRate: Double,
               var shift: Int
               ) {
    var total = 0.0
    private val twoDigits = DecimalFormat("$#,###.00")

    init {

    }

    fun calculate(hoursIn: Double) {
        var overtime = 0.0
        var hours = hoursIn
        var rate = payRate
        if(shift == 3)
            rate = 1.1 * payRate
        else if(shift == 2)
            rate = 1.05 * payRate

        total = 0.0

        if (!salary && (hoursIn > 40)) {
            overtime = hoursIn - 40
            hours = 40.0
            total += overtime.toDouble() * 1.5 * rate
        }

        total += rate * (hours.toDouble())

        println("$name earned ${twoDigits.format(total)} this week")


    }

    fun display() {
        var display = ""

        display += "$name\n"
        display += "${position.shortName}\n"
        display += "Is salary: $salary\n"
        display += "Shift: $shift\n"
        display += "Rate of pay is: ${twoDigits.format(payRate)} per hour"

        println(display)
    }
}