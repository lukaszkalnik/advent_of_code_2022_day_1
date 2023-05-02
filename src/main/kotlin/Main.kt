import okio.FileSystem
import okio.Path.Companion.toPath

fun main(args: Array<String>) {
    val path = "input.txt".toPath()
    val inventoriesString = FileSystem.SYSTEM.read(path) { readUtf8() }
    val maxInventory = inventoriesString.dropLast(1).split("\n\n")
        .map { inventoryString -> inventoryString.split("\n") }
        .map { inventory -> inventory.map { item -> item.toInt() } }
        .map { inventory -> inventory.sum() }
        .max()
    println(maxInventory)
}