
package javapoo;

/**
 *
 * @author Rosi-PC
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String nroPaginas;
    
    public Libro(){
    
    }
    
    public Libro(String isbn, String titulo, String autor, String nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(String nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

   public void mostrarLibro() {

        System.out.println("El isbn del libro es: " + isbn);
        System.out.println("El titulo es : " + titulo);
        System.out.println("El autor es :" + autor);
        System.out.println("El numero de paginas es : " + nroPaginas);

    }
    
    
    
}
