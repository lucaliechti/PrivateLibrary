import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Book } from 'app/book';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class BookService {

  private bookUrl: string;

  constructor(private http: HttpClient) {
    this.bookUrl = 'http://localhost:8080/books';
  }

  public findAll(): Observable<Book[]> {
    return this.http.get<Book[]>(this.bookUrl);
  }

}
