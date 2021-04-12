import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ApiModule, BASE_PATH } from 'src/openapi';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ApiModule
  ],
  providers: [],
  // Override BASE_PATH for OpenAPI services here if desired.
  //providers: [{ provide: BASE_PATH, useValue: '/api'}],
  bootstrap: [AppComponent]
})
export class AppModule { }
