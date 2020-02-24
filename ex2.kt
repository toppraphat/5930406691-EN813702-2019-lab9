package phasupho.praphat.lab9

open class Book (val title: String, val author: String){
    protected var currentPage = 1

    open fun readPage(){
        currentPage++
    }
    override fun toString(): String {
        return "Title: $title Author: $author CurrentPage: $currentPage\n"
    }

}
class eBook(title: String, author: String, val format:String = "text"): Book(title,author){
    var wordCount = 250
    override fun readPage(){
        super.readPage()
        wordCount += 250
    }
    override fun toString(): String {
        return super.toString() + " Format: $format WordCount: $wordCount"
    }
}
fun main(){
    var b1 = Book("Principles","Ray Dalio")
    b1.readPage()
    println(b1)

    var eb1 = eBook("How Will You Measure Your Life?","Clayton M. Chirstensen")
    println(eb1)
    eb1.readPage()

    var eb2 = eBook("End of Days: Predictions and Prophecies about the End of the World","Sylvia Browne")
    eb2.readPage()
    eb2.readPage()
    println(eb2)

}