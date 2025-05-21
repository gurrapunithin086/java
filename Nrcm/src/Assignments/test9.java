package Assignments;

interface BookOperations {
    void addBook();
    void listBooks();
}

interface MemberOperations {
    void registerMember();
    void listMembers();
}

interface LoanOperations {
    void issueBook();
    void returnBook();
}

class Library implements BookOperations, MemberOperations, LoanOperations {
    public void addBook() {
        System.out.println("Book added to the library.");
    }

    public void listBooks() {
        System.out.println("Listing all books: Java Programming, Python Essentials, Data Science 101");
    }

    public void registerMember() {
        System.out.println("New member registered.");
    }

    public void listMembers() {
        System.out.println("Members: Alice, Bob, Charlie");
    }

    public void issueBook() {
        System.out.println("Book issued to member.");
    }

    public void returnBook() {
        System.out.println("Book returned successfully.");
    }
}

interface Administration {
    void libraryAdminDetails();
}

class LibraryAdmin extends Library implements Administration {
    public void libraryAdminDetails() {
        System.out.println("Admin: Head Librarian, Assistant Librarian");
    }

    public void libraryInfo() {
        System.out.println("Library Location: Central City, Established: 1995");
    }
}

public class test9 {
    public static void main(String[] args) {
        LibraryAdmin admin = new LibraryAdmin();
        Library lib = new Library();

        admin.libraryAdminDetails();
        admin.libraryInfo();

        lib.addBook();
        lib.listBooks();

        lib.registerMember();
        lib.listMembers();

        lib.issueBook();
        lib.returnBook();
    }
}
