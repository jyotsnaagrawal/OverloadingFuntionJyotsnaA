import java.util.*

fun main() {
    // Ask the user if they are a residential or business customer
    println("Are you a Residential or Business customer?")
    val customerType = readlnOrNull()?.uppercase(Locale.ROOT)

    // Check and call the appropriate method based on customer type
    when (customerType) {
        "RESIDENTIAL" -> getResidentialCustomerInfo()
        "BUSINESS" -> getBusinessCustomerInfo()
        else -> println("Invalid customer type. Please specify 'Residential' or 'Business'.")
    }
}

// Method for residential customers
fun getResidentialCustomerInfo() {
    // Prompt the user to enter residential customer information
    println("Enter your name:")
    val name = readlnOrNull()

    println("Enter your phone number:")
    val phoneNumber = readlnOrNull()

    // Display residential customer information
    println("Residential Customer Information:")
    println("Name: $name")
    println("Phone Number: $phoneNumber")
}

// Method for business customers
fun getBusinessCustomerInfo() {
    // Prompt the user to enter business customer information
    println("Enter your business name:")
    val businessName = readlnOrNull()

    println("Enter your contact name:")
    val contactName = readlnOrNull()

    println("Enter your phone number:")
    val phoneNumber = readlnOrNull()

    // Display business customer information
    println("Business Customer Information:")
    println("Business Name: $businessName")
    println("Contact Name: $contactName")
    println("Phone Number: $phoneNumber")
}
