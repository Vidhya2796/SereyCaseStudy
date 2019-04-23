import { Component, OnInit } from '@angular/core';
import { PoststrendService } from '../poststrend.service';

@Component({
  selector: 'app-trendpost',
  templateUrl: './trendpost.component.html',
  styleUrls: ['./trendpost.component.css']
})
export class TrendpostComponent implements OnInit {
  reslikes:any
  likes:number
  posts:any;
    constructor(private poststrendService:PoststrendService) { }
  
    ngOnInit() {
       this.poststrendService.getAllusers().subscribe((posts)=>{
        this.posts=posts;
        console.log(this.posts)
      }) 

  
    }
    onLike(likes:number,userName:string){
      console.log("hello"+likes+userName)
    this.likes=likes++;
    console.log(likes)
    this.poststrendService.updateLike(userName,likes).subscribe((likes)=>{
      this.reslikes=likes;
      console.log(this.reslikes)
    }) 
  }

}
