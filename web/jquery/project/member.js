// 회원의 정보 : 아이디, 비밀번호, 이름
// Member -> 생성자 함수를 정의
function Member(id, pw, name) {
    this.userid = id;
    this.pw = pw;
    this.username = name;
}
// 객체가 가지는 메소드는 공통으로 사용 -> prototype
Member.prototype.makeHtml = function () {
    return '[id:' + this.userId + ' , pw: ' + this.pw + ' , name: ' + this.userName + ' ]'
};