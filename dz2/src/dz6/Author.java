package dz6;

public class Author {
    //свойства\поля\атрибуты
    public long id;
    public String name;
    public int years;
    public byte day;
    public byte moth;
    public int year;

    public Author(long authorId) {
        id = authorId;
    }

    public Author(long authorId, String name) {
        id = authorId;
        this.name = name;
    }

}
