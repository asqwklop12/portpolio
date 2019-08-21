#유저
create TABLE userInfo(
UserImage varchar(25),
UserEmail varchar(50) not null unique,
UserName varchar(30) not null unique,
UserPassword varchar(255) not null,
UserIntroduce varchar(200),
UserDate date,
userAuthorization varchar(50) default 'N', 
constraint user_PK primary key(UserEmail))
engine = InnoDB default charset=utf8mb4 ;


# 랜덤 프로필	
create table profile_box(
profileId int auto_increment,
profileImage varchar(50) unique not null,
primary key (profileId))
engine = InnoDB default charset = utf8mb4;


#게시판 (기본)
CREATE TABLE boardInfo(
boardId int auto_increment,
boardprofile varchar(25),
userEmail varchar(50) not null,
boardWriter varchar(30) not null,
boardTitle varchar(50) not null,
boardContent text not null,
boardDate date not null,
boardView int default 0,
constraint board_PK primary key(boardId),
constraint board_FK foreign key(userEmail) references userinfo(userEmail))
engine = InnoDB default charset = utf8mb4;


#공지사항
create table noticeInfo(
noticeId int auto_increment,
boardId int,
userEmail varchar(50) not null,
boardTitle varchar(50) not null,
constraint notice_PK primary key(noticeId),
constraint notice_Fk1 foreign key(boardId) references boardinfo(boardId),
constraint notice_FK2 foreign key(userEmail) references userInfo(userEmail))
engine = InnoDB default charset = utf8mb4;

create 	table searchList(
   searchId int not null auto_increment,
   searchNumber int not null,
   userEmail varchar(20) not null,
   bookTitle varchar(200) not null,
   searchAuthor varchar(30) not null,
   searchPublisher varchar(20) not null,
   constraint Search_PK primary key(searchId),
   constraint Search_FK1 foreign key(bookTitle) references BookbasicInfo(bookTitle),
   constraint Search_FK2 foreign key (userEmail) references userinfo(userEmail))
   engine = InnoDB default charset=utf8mb4;

#댓글
create table commentInfo(
 commentId int auto_increment,
 boardId int not null,
 userEmail varchar(50) not null,
 commentWriter varchar(30) not null,
 commentProfile varchar(25),
 commentContent text,
 constraint comment_PK primary key (commentId),
 constraint comment_FK1 foreign key(userEmail) references userinfo(userEmail),
 constraint comment_FK2 foreign key(boardId) references boardinfo(boardId))
 engine = InnoDB default charset=utf8mb4;
	
# 책(기본 정보)  
CREATE TABLE BookbasicInfo(
bookPicture varchar(255),
bookTitle varchar(200)not null unique,
bookAuthor varchar(30)not null,
bookpublisher varchar(20) not null,
bookISBN bigint,
bookPage int default 0,
bookPrice int default 0,
bookLike int default 0,
constraint book_PK primary key(bookTitle))
engine = InnoDB default charset=utf8mb4;

# 책(상세 정보)
CREATE TABLE BookdetailInfo(
bookTitle varchar(200)not null unique,
bookSummary text not null,
bookIndex text not null,
constraint book_PK primary key(bookTitle),
constraint book_FK foreign key(bookTitle) references BookbasicInfo(bookTitle))
engine = InnoDB default charset=utf8mb4;


# 좋아요
create table LikeInfo(
  likeId int not null auto_increment,
  bookTitle varchar(200) not null,
  userEmail varchar(20) not null,
  bookLike int default 0,
  constraint like_PK primary key(likeId),
  constraint like_FK1 foreign key (userEmail) references userinfo(userEmail),
  constraint like_FK2 foreign key (bookTitle) references BookbasicInfo(bookTitle))
  engine = InnoDB default charset = utf8mb4;
