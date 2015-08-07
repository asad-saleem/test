var myApp=angular.module('myApp',[]);
var myapp=angular.module('myapp',[]);
myapp.controller('SignInController',function($scope, $http) {
    $scope.Hello=function(){
            $http.get('data.json').success(function (data) {
                    $scope.record = data;
                    if($scope.record.username===$scope.frm.email || $scope.record.password===$scope.frm.password){
                        window.location("index1.html");
                    }
                    else{
                        $scope.error=response.message; 
                    }
                    });
                }
                });
myapp.controller('SignInController',['$scope',function($scope) {
                    $scope.SignUp = function() {
                        window.location = "SignUp.html";      
                    }
                    }]);
myApp.controller('Controller',['$scope','$http',function($scope,$http) {
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
myApp.controller('Controller',['$scope',function($scope) {
                    $scope.Cancel = function() {
                        window.location = "SignIn.html";      
                    }
                    }]);