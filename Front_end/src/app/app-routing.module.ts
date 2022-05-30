import { NgModule } from '@angular/core';
import { RouterModule ,ROUTES,Routes } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './components/home/home.component';
import { IniciarSesionComponent } from './components/iniciar-sesion/iniciar-sesion.component';
import { EditarProyectoComponent } from './editar/editar-proyecto/editar-proyecto.component';
import { AgregarProyectoComponent } from './agregar/agregar-proyecto/agregar-proyecto.component';
import { AgregarExperienciaComponent } from './agregar/agregar-experiencia/agregar-experiencia.component';
import { EditarExperienciaComponent } from './editar/editar-experiencia/editar-experiencia.component';
import { EditarEducacionComponent } from './editar/editar-educacion/editar-educacion.component';
import { AgregarTecnologiaComponent } from './agregar/agregar-tecnologia/agregar-tecnologia.component';
import { EditarTecnologiaComponent } from './editar/editar-tecnologia/editar-tecnologia.component';
import { AgregarEducacionComponent } from './agregar/agregar-educacion/agregar-educacion.component';
import { EditarPerfilComponent } from './editar/editar-perfil/editar-perfil.component';


const routes: Routes = [
  {path:'home',component: HomeComponent},
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'iniciar-sesion', component: IniciarSesionComponent},
  {path:'editar-proyecto/:id',component:EditarProyectoComponent},
  {path:'agregar-proyecto', component: AgregarProyectoComponent},
  {path:'agregar-experiencia', component: AgregarExperienciaComponent},
  {path:'editar-experiencia/:id',component:EditarExperienciaComponent},
  {path:'editar-educacion/:id',component:EditarEducacionComponent},
  {path:'agregar-tecnologia', component: AgregarTecnologiaComponent},
  {path:'editar-tecnologia/:id',component:EditarTecnologiaComponent},
  {path:'agregar-educacion', component: AgregarEducacionComponent},
  {path:'editar-perfil/:id', component: EditarPerfilComponent},
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
