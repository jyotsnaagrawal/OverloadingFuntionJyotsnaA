fun main() {
    // Test cases
    getCustomerInfo("Residential", "John Doe", "123-456-7890")
    getCustomerInfo("Business", "ABC Company", "Jane Smith", "987-654-3210")
}

// Overloaded method for residential customers
fun getCustomerInfo(customerType: String, name: String, phoneNumber: String) {
    if (customerType.equals("Residential", ignoreCase = true)) {
        println("Residential Customer Information:")
        println("Name: $name")
        println("Phone Number: $phoneNumber")
    } else {
        println("Invalid customer type. Please specify 'Residential' or 'Business'.")
    }
}

// Overloaded method for business customers
fun getCustomerInfo(customerType: String, businessName: String, contactName: String, phoneNumber: String) {
    if (customerType.equals("Business", ignoreCase = true)) {
        println("Business Customer Information:")
        println("Business Name: $businessName")
        println("Contact Name: $contactName")
        println("Phone Number: $phoneNumber")
    } else {
        println("Invalid customer type. Please specify 'Residential' or 'Business'.")
    }
}
