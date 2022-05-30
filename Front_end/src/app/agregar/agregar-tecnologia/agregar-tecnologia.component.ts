import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { tecnologia } from 'src/app/models/tecnologia.model';
import { SkillsService } from 'src/app/servicios/skills.service';

@Component({
  selector: 'app-agregar-tecnologia',
  templateUrl: './agregar-tecnologia.component.html',
  styleUrls: ['./agregar-tecnologia.component.css']
})
export class AgregarTecnologiaComponent implements OnInit {

  tecnologia: tecnologia= new tecnologia();
  constructor(private tecnologiaServicio:SkillsService,
                       private router:Router,
                      private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  
  agregarTecnologia(){
    this.tecnologiaServicio.agregarNuevaSkill(this.tecnologia).subscribe(dato=>{
      this.volverHome();
    })

  }
  volverHome(){
    this.router.navigate(['/home']);
  }
  onSubmit(){
    this.agregarTecnologia();
  }

}
