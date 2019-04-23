import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TrendpostComponent } from './trendpost/trendpost.component';

const routes: Routes = [{path:"trend",component:TrendpostComponent}];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const route=[TrendpostComponent]