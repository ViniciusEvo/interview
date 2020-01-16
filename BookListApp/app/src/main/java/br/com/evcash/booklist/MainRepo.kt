package br.com.evcash.booklist
import kotlinx.coroutines.delay
class MainRepo {
    private val bookList = ArrayList<Book>()
    init {
        bookList.add(Book("Rangers", arrayListOf("John F. Flanagan"), 1L, 12345L))
        bookList.add(Book("Harry Potter", arrayListOf(" J. K. Rowling"), 1L, 54321L))
        bookList.add(Book("Drácula", arrayListOf("Bram Stoker"), 2L, 125L))
        bookList.add(Book("O Pequeno Urso", arrayListOf("Micheal Jackson"), 3L, 9999L))
        bookList.add(Book("Os Miseráveis", arrayListOf("Victor Hugo"), 4L, 96868L))
        bookList.add(Book("Colette", arrayListOf("Jane Austen"), 4L, 8787L))
        bookList.add(Book("Crônicas de Magia e Espada", arrayListOf(" George R. R. Martin"," Michael Moorcock", "Robert E. Howard", " George R. R. Martin"," Michael Moorcock", "Robert E. Howard"), 1L, 1111L))
        bookList.add(Book("Como Passar Na Entrevista de Emprego", arrayListOf("Vinicius Sant Ana","João Scallet"), 5L, 11121L))
        bookList.add(Book("O Exorcista", arrayListOf(" William Peter Blatty"), 2L, 99777L))
        bookList.add(Book("A Culpa é das Estrelas", arrayListOf("John Green"), 4L, 1233245L))
        bookList.add(Book("Os Três Porquinhos", arrayListOf("Desconhecido"), 3L, 1234345L))
        bookList.add(Book("Que Livro é Esse?", arrayListOf("Quem será?","Não achamos"), 9L, 12355545L))
        bookList.add(Book("Carry, a Estranha", arrayListOf("a","b"), 2L, 126555345L))
        bookList.add(Book("Rangers", arrayListOf("a","b"), 9L, 123L))
        bookList.add(Book("Como Vencer na Vida", arrayListOf("Fabiana Nicchio","Felipe Milani", "José Pinto"), 5L, 1345L))
        bookList.add(Book("O Estranho Mundo de Jack", arrayListOf("Tim Burton", "Michael McDowell"), 3L, 4444L))
        bookList.add(Book("Pokemon", arrayListOf("Ash Ketchum"), 1L, 2212345L))
        bookList.add(Book("O Três Mosqueteiros", arrayListOf("Alexandre Dumas"), 1L, 2125L))
        bookList.add(Book("Cilada", arrayListOf("Bino"), 2L, 921999L))
        bookList.add(Book("Chapeuzinho Vermelho", arrayListOf("Jerry Pinkney", "Charles Perrault", "Trina Schart Hyman", "Jerry Pinkney", "Charles Perrault", "Trina Schart Hyman"), 3L, 296868L))
        bookList.add(Book("O Milagre da Manhã", arrayListOf("Hal Elrod"), 5L, 28787L))
        bookList.add(Book("Um Drama Triste", arrayListOf("Um Autor Triste"), 41L, 5214321L))
        bookList.add(Book("Fogo & Sangue", arrayListOf("George R. R. Martin"), 1L, 2122225L))
        bookList.add(Book("Beren e Lúthien", arrayListOf("J. R. R. Tolkien"), 2L, 921111999L))
        bookList.add(Book("O Conto da Aia", arrayListOf("Margaret Atwood"), 4L, 296833368L))
        bookList.add(Book("It: A coisa", arrayListOf("Stephen King"), 2L, 28121787L))
        bookList.add(Book("Last Book", arrayListOf("Last Author"), 8L, 52121214321L))
    }
    suspend fun getBooks(): ArrayList<Book> {
        delay(5000L)
        return bookList
    }
}