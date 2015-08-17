var myApp=angular.module('myApp',[]);
var myapp=angular.module('myapp',[]);
//var SignUp = angular.module('SignUpNew',[]);
myapp.controller('SignInController',function($scope, $http) {
    $scope.Hello=function(){
        var counter = 0;
    	$http.get('http://localhost:8080/Webapp/webapi/newusers/all').success(function (data) {   
            	$scope.record = data;
           
            	for(var i=0; i<data.length; i++){
                    if($scope.user.email==data[i].email && $scope.user.password==data[i].password){
                        alert("Exists");
                        break;
                    }
                    else{
                        counter++;
                    }
                   }
            	if(counter == data.length){
            		alert("Wrong");
            	}
                    });
                }
                });

myApp.controller('SignUpController',['$scope',function($scope) {
                    $scope.Cancel = function() {
                        window.location = "SignIn.html";      
                    }
                    $scope.submitForm = function() {
                        
                        $scope.submitted = true;
                        if ($scope.userForm.$valid) {
                            alert("Form is valid!");
                        }
                        else {
                         alert("Please correct errors!");
                        }
                     }
                    }]);

var SignUp=angular.module('SignUp',[]);
var SignIn=angular.module('SignIn',[]);
/*SignIn.controller('SignInController',function($scope, $http) {
    $scope.SignUp = function() {
                        window.location = "SignUp.html";      
                    }
    $scope.Hello=function(){
    	$http.get('http://localhost:8080/Webapp/webapi/users').success(function (data) {
                alert(data);
                    if($scope.user.email===data.username || $scope.user.password===data.password){
                        window.location("index1.html");
                    }
                    else{ 
                        alert("UserName or Password is incorrect");
                    }
                    });
                }
                });*/

/*SignUp.controller('SignUpController',function($scope,$http) {
                    $scope.Cancel = function() {
                        window.location = "SignIn.html";      
                    }
                    $scope.submitForm = function() {
                        $http.post("data.json",{"username":$scope.user.username,"password":$scope.user.password}).success(function(data,status,headers,config){
                            alert("data inserted successfully");
                        });
                        $scope.user.username='';
                        $scope.user.password='';
                       
                   
                    }
                    });*/