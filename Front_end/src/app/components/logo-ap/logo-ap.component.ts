import { Component, OnInit } from '@angular/core';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';

@Component({
  selector: 'app-logo-ap',
  templateUrl: './logo-ap.component.html',
  styleUrls: ['./logo-ap.component.css']
})
export class LogoApComponent implements OnInit {
  isUserLoggedIn: boolean = false;
  logout: boolean;
  constructor(private autenticacionServicio:AutenticacionService) { }

  ngOnInit(): void {
    this.isUserLoggedIn =this.autenticacionServicio.isUserLoggedIn();
    this.cerrarsesion();
  }

  private cerrarsesion(){
    this.autenticacionServicio.logout();
  }
}
