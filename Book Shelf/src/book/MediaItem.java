package book;

public class MediaItem extends LibraryItem{
    private String format;
    private String runtime;

    public MediaItem() {
        format = "format of media item";
        runtime = "runtime of media item";
    }

    public MediaItem(String format, String runtime) {
        this.format = format;
        this.runtime = runtime;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public void research() {
        System.out.println("watching Media Item");
    }
    @Override
    public void displayDetails() {
        System.out.println(format);
        System.out.println(runtime);
    }
}
