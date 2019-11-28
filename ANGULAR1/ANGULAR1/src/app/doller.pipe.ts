import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'doller'
})
export class DollerPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return '$' + value;
  }

}
