import { Component, OnInit } from '@angular/core';
import { AutenticacionService } from 'src/app/servicios/autenticacion.service';

@Component({
  selector: 'app-redes-sociales',
  templateUrl: './redes-sociales.component.html',
  styleUrls: ['./redes-sociales.component.css']
})
export class RedesSocialesComponent implements OnInit {

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
