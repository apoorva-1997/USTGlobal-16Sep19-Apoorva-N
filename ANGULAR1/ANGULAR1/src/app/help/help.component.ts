
import { Component } from '@angular/core';


@Component({
    selector : 'app-help',
    templateUrl : './help.component.html',
    styleUrls : ['./help.component.css']
})

export class HelpComponent {
    colorname = 'red';
    color = 'purple';
    
    isactive = true;
    constructor() {
        setInterval(() => {
     this.isactive = !this.isactive;
        }, 2000);
    }
}


