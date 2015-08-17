var signUp=angular.module('signUp',[]);
signUp.controller("SignUpController",function($scope,$http){
	$scope.Cancel=function(){
		//window.location="SignIn.html";
		var newUserData = {
				"firstName": $scope.user.firstname,
				"lastName": $scope.user.lastname,
			    "age": $scope.user.age,
			    "cnic": $scope.user.cnic,
			    "country": $scope.user.country,
			    "city": $scope.user.city,
			    "postalAddress": $scope.user.postaladdress,
			    "contact1": $scope.user.contact1,
			    "contact2": $scope.user.contact2,
			    "contact3": $scope.user.contact3,
			    "gender": "Male",
			    "userName": $scope.user.username,
			    "email" : $scope.user.email,
			    "password": $scope.user.password,
			    "rePassword": $scope.user.confirmPassword
			   };
$http.post('http://localhost:8080/Webapp/webapi/newusers',newUserData).success(function (data) {
alert("added");
});
	}
	$scope.submitForm=function(){
		
	}
});