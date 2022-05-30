import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { educacion } from 'src/app/models/educacion.model';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-agregar-educacion',
  templateUrl: './agregar-educacion.component.html',
  styleUrls: ['./agregar-educacion.component.css']
})
export class AgregarEducacionComponent implements OnInit {

  educacion:educacion = new educacion();

  constructor(private educacionServicio:EducacionService,
              private router: Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  agregarEducacion(){
    this.educacionServicio.agregarNuevaEducacion(this.educacion).subscribe(dato =>{
      this.volverHome();
    })
  }
  volverHome(){
    this.router.navigate(['/home'])
  }
  onSubmit(){
    this.agregarEducacion();
  }
}
