import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(books: any[], searchvalue: number): any[] {
    if (!searchvalue) {
      return books;
    } else {
      return books.filter(data => {
        return data;
      });
    }

  }

}
