import { NgModule } from '@angular/core';
import { RouterModule ,ROUTES,Routes } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './components/home/home.component';
import { IniciarSesionComponent } from './components/iniciar-sesion/iniciar-sesion.component';
import { EditarProyectoComponent } from './editar/editar-proyecto/editar-proyecto.component';


const routes: Routes = [
  {path:'home',component: HomeComponent},
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'iniciar-sesion', component: IniciarSesionComponent},
  {path:'editar-proyecto/:id',component:EditarProyectoComponent},
  
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
