import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoApComponent } from './components/logo-ap/logo-ap.component';
import { RedesSocialesComponent } from './components/redes-sociales/redes-sociales.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { SkillsComponent } from './components/skills/skills.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { FooterComponent } from './components/footer/footer.component';
import { AppRoutingModule } from './app-routing.module';
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { HomeComponent } from './components/home/home.component';
import { IniciarSesionComponent } from './components/iniciar-sesion/iniciar-sesion.component';
import { AcercaDeService } from './servicios/acerca-de.service';
import { InterceptorService } from './servicios/interceptor.service';
import { EditarProyectoComponent } from './editar/editar-proyecto/editar-proyecto.component';
import { AgregarProyectoComponent } from './agregar/agregar-proyecto/agregar-proyecto.component';
import { AgregarExperienciaComponent } from './agregar/agregar-experiencia/agregar-experiencia.component';
import { EditarExperienciaComponent } from './editar/editar-experiencia/editar-experiencia.component';
import { EditarEducacionComponent } from './editar/editar-educacion/editar-educacion.component';
import { AgregarTecnologiaComponent } from './agregar/agregar-tecnologia/agregar-tecnologia.component';
import { EditarTecnologiaComponent } from './editar/editar-tecnologia/editar-tecnologia.component';
import { AgregarEducacionComponent } from './agregar/agregar-educacion/agregar-educacion.component';
import { EditarPerfilComponent } from './editar/editar-perfil/editar-perfil.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoApComponent,
    RedesSocialesComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    SkillsComponent,
    ProyectosComponent,
    FooterComponent,
    HomeComponent,
    IniciarSesionComponent,
    EditarProyectoComponent,
    AgregarProyectoComponent,
    AgregarExperienciaComponent,
    EditarExperienciaComponent,
    EditarEducacionComponent,
    AgregarTecnologiaComponent,
    EditarTecnologiaComponent,
    AgregarEducacionComponent,
    EditarPerfilComponent,
    

  ],
  imports: [
    BrowserModule,
    NgCircleProgressModule.forRoot({}),
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [AcercaDeService,
    {
      provide:HTTP_INTERCEPTORS,useClass:InterceptorService,multi:true
    },
  ],
  bootstrap: [ AppComponent]
})
export class AppModule { }
