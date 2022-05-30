import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { experiencia } from 'src/app/models/experiencia.model';
import { ExperienciaService } from 'src/app/servicios/experiencia.service';

@Component({
  selector: 'app-agregar-experiencia',
  templateUrl: './agregar-experiencia.component.html',
  styleUrls: ['./agregar-experiencia.component.css']
})
export class AgregarExperienciaComponent implements OnInit {

  experiencia: experiencia= new experiencia();

  constructor(private experienciaServicio:ExperienciaService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  agregarExperiencia(){
    this.experienciaServicio.agregarNuevoProyecto(this.experiencia).subscribe(dato=>{
      this.volverHome();
    })
  }

  volverHome(){
    this.router.navigate(['/home']);
  }
  onSubmit(){
    this.agregarExperiencia();
  }

}
