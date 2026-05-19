      <nav class="app-header navbar navbar-expand bg-body">
         <!--begin::Container-->
         <div class="container-fluid">
           <!--begin::Start Navbar Links-->
           <ul class="navbar-nav">
             <li class="nav-item">
               <a class="nav-link" data-lte-toggle="sidebar" href="#" role="button">
                 <i class="bi bi-list"></i>
               </a>
             </li>
             <li class="nav-item d-none d-md-block">
               <a href="index-enhanced.php" class="nav-link">Home</a>
             </li>
           </ul>
           <!--end::Start Navbar Links-->

           <!--begin::End Navbar Links-->
           <ul class="navbar-nav ms-auto">
             <!--begin::User Menu Dropdown-->
             <li class="nav-item dropdown user-menu">
               <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                 <img
                   src="./assets/img/user2-160x160.jpg"
                   class="user-image rounded-circle shadow"
                   alt="User Image"
                 />
                 <span class="d-none d-md-inline">Alexander Pierce</span>
               </a>
               <ul class="dropdown-menu dropdown-menu-lg dropdown-menu-end">
                 <!--begin::User Image-->
                 <li class="user-header text-bg-primary">
                   <img
                     src="./assets/img/user2-160x160.jpg"
                     class="rounded-circle shadow"
                     alt="User Image"
                   />
                   <p>
                     Alexander Pierce - Web Developer
                     <small>Member since Nov. 2023</small>
                   </p>
                 </li>
                 <!--begin::Menu Footer-->
                 <li class="user-footer">
                   <a href="#" class="btn btn-outline-secondary">Profile</a>
                   <a href="logout.php" class="btn btn-outline-danger float-end">Sign out</a>
                 </li>
                 <!--end::Menu Footer-->
               </ul>
             </li>
             <!--end::User Menu Dropdown-->
           </ul>
           <!--end::End Navbar Links-->
         </div>
         <!--end::Container-->
       </nav>
       <!--end::Header-->
       <!--begin::Sidebar-->
       <aside class="app-sidebar bg-body-secondary shadow" data-bs-theme="dark">
         <!--begin::Sidebar Brand-->
         <div class="sidebar-brand">
           <!--begin::Brand Link-->
           <a href="./index-enhanced.php" class="brand-link">
             <!--begin::Brand Image-->
             <img
               src="./assets/img/AdminLTELogo.png"
               alt="AdminLTE Logo"
               class="brand-image opacity-75 shadow"
             />
             <!--end::Brand Image-->
             <!--begin::Brand Text-->
             <span class="brand-text fw-light">Section 2 Secure</span>
             <!--end::Brand Text-->
           </a>
           <!--end::Brand Link-->
         </div>
         <!--end::Sidebar Brand-->
         <!--begin::Sidebar Wrapper-->
         <div class="sidebar-wrapper">
           <nav class="mt-2">
             <!--begin::Sidebar Menu-->
             <ul
               class="nav sidebar-menu flex-column"
               data-lte-toggle="treeview"
               role="navigation"
               aria-label="Main navigation"
               data-accordion="false"
               id="navigation"
             >
               <li class="nav-item menu-open">
                 <a href="#" class="nav-link active">
                   <i class="nav-icon bi bi-speedometer"></i>
                   <p>
                     Main Menu
                     <i class="nav-arrow bi bi-chevron-right"></i>
                   </p>
                 </a>
                 <ul class="nav nav-treeview">
                   <li class="nav-item">
                     <a href="./insert-enhanced.php" class="nav-link">
                       <i class="nav-icon bi bi-circle text-info"></i>
                       <p>Add secure User</p>
                     </a>
                   </li>
                   <li class="nav-item">
                     <a href="./index-enhanced.php" class="nav-link active">
                       <i class="nav-icon bi bi-circle text-success"></i>
                       <p>Users Dashboard</p>
                     </a>
                   </li>
                 </ul>
               </li>
      
             </ul>
             <!--end::Sidebar Menu-->
           </nav>
         </div>
         <!--end::Sidebar Wrapper-->
       </aside>
