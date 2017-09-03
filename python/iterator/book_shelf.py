from book_shelf_iterator import BookShelfIterator


class BookShelf:
    def __init__(self):
        self.books = []
        self.last = 0

    def get_book_at(self, index):
        return self.books[index]

    def append_book(self, book):
        self.books.append(book)
        self.last += 1

    def __len__(self):
        return self.last

    def iterator(self):
        return BookShelfIterator(self)
