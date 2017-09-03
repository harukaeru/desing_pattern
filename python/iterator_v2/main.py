from book_shelf import BookShelf
from book import Book

book_shelf = BookShelf()
book_shelf.append_book(Book('X'))
book_shelf.append_book(Book('Y'))
book_shelf.append_book(Book('Z'))
book_shelf.append_book(Book('K'))

it = book_shelf.iterator()

while (it.has_next()):
    book = it.next()
    print(book.get_name())
