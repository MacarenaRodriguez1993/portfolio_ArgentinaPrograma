import { NgModule } from '@angular/core';
import { RouterModule ,ROUTES,Routes } from '@angular/router';
import { CommonModule } from '@angular/common';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';


const routes: Routes = [
  {path:'home',component: HomeComponent},
  {path:'experiencia', component:ExperienciaComponent},
  {path:'',redirectTo:'home',pathMatch:'full'},
  
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
