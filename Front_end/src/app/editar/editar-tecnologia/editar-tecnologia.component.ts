import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { tecnologia } from 'src/app/models/tecnologia.model';
import { SkillsService } from 'src/app/servicios/skills.service';

@Component({
  selector: 'app-editar-tecnologia',
  templateUrl: './editar-tecnologia.component.html',
  styleUrls: ['./editar-tecnologia.component.css']
})
export class EditarTecnologiaComponent implements OnInit {
  id:number;
  tecnologia:tecnologia= new tecnologia();
  constructor(private tecnologiaServicio:SkillsService,
              private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.tecnologiaServicio.obtenerSkillsPorId(this.id).subscribe(dato=>{
      this.tecnologia=dato;
    },error=>console.log(error));
  }

  volverHome(){
    this.router.navigate(['/home'])
  }

  onSubmit(){
    this.tecnologiaServicio.editarSkillPorId(this.id,this.tecnologia).subscribe(dato=>{
      this.volverHome();
    })

  }

}
