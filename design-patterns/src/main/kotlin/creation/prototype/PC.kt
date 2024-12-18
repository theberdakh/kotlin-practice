package creation.prototype

//prototype
data class PC(
    val motherboard: String,
    val cpu: String,
    val graphic: String,
    val ram: String
)


fun main(){
    val pc = PC(motherboard = "ic3", cpu = "ic3", graphic = "rtx", ram = "16gb")
    pc.copy(cpu = "32", motherboard = "sdf")
    println(pc)
}